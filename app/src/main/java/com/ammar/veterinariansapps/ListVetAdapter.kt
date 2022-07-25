package com.ammar.veterinariansapps

import android.app.DownloadManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*
import kotlin.collections.ArrayList


class ListVetAdapter(val listVet : ArrayList<Vet>) : RecyclerView.Adapter<ListVetAdapter.ViewHolder>(), Filterable {
    var listVetFilter : ArrayList<Vet> = ArrayList()
    init {
        listVetFilter = listVet
    }

    interface OnItemClick {
        fun onItemClicked(data: Vet)
    }

    private lateinit var onItemClick : OnItemClick

    fun setOnItemClick(onItemClick: OnItemClick){
        this.onItemClick = onItemClick
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var txtVetPhoto : ImageView = itemView.findViewById(R.id.tvVetPhoto)
        var txtVetName : TextView = itemView.findViewById(R.id.tvVetName)
        var txtVetCity : TextView = itemView.findViewById(R.id.tvVetCity)
        var txtVetOpenHours : TextView = itemView.findViewById(R.id.tvOpenHoursVet)
        var txtVetCloseHours : TextView = itemView.findViewById(R.id.tvCloseHoursVet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_vet, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val vet = listVetFilter[position]

        Glide.with(holder.itemView.context)
                .load(vet.vetPhoto)
                .apply(RequestOptions().override(90, 90))
                .into(holder.txtVetPhoto)

        holder.txtVetName.text = vet.vetName.trim()
        holder.txtVetCity.text = vet.vetCity.trim()
        holder.txtVetOpenHours.text = vet.vetOpenHours.trim()
        holder.txtVetCloseHours.text = vet.vetCloseHours.trim()

        holder.itemView.setOnClickListener {
            onItemClick.onItemClicked(listVetFilter[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listVetFilter.size
    }




    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charString = constraint.toString()
                charString.trim()
                if(charString.isEmpty()){
                    listVetFilter = listVet
                } else {
                    val resultList = ArrayList<Vet>()

                    listVet.filter {
                        (it.vetName.toLowerCase().contains(constraint!!.trim())) or (it.vetCity.toLowerCase().contains(constraint.trim()))
                    }.forEach{
                        resultList.add(it)
                    }
                    listVetFilter = resultList

                }
                return FilterResults().apply { values = listVetFilter }
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                listVetFilter = if(results?.values == null)
                    ArrayList()
                else
                    results.values as ArrayList<Vet>
                notifyDataSetChanged()
            }
        }
    }


}