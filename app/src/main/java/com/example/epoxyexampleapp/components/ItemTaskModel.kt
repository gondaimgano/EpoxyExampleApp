package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemTaskBinding

open class ItemTaskModel:EpoxyModelWithHolder<ItemTaskModel.Holder>() {

    @EpoxyAttribute
    var title=""
    @EpoxyAttribute
    var description=""

    class Holder:EpoxyHolder(){
        lateinit var binding:ItemTaskBinding
        private set

        override fun bindView(itemView: View) {
            binding = ItemTaskBinding.bind(itemView)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_task
    }

    override fun createNewHolder(parent: ViewParent): Holder = Holder()

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder.binding){
            this.materialTextView.text = title
            this.materialTextView2.text=description
        }
    }
}