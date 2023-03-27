package fr.epf.mm.gestionclientmin2_cg

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import fr.epf.mm.gestionclientmin2_cg.model.Client

class ClientAdapter(val clients: List<Client>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = clients.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}
