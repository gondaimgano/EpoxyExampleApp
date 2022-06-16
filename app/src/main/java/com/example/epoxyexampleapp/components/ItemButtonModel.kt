package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemButtonBinding

open class ItemButtonModel:EpoxyModelWithHolder<ItemButtonModel.Holder>() {
    @EpoxyAttribute
    var label:String=""
     @EpoxyAttribute
    var listener: View.OnClickListener? = null

    class Holder:EpoxyHolder() {
         lateinit var binding:ItemButtonBinding
         private set

        override fun bindView(itemView: View) {
            binding= ItemButtonBinding.bind(itemView)
        }
    }

    override fun unbind(holder: Holder) {
        holder.binding.button.setOnClickListener(null)
        super.unbind(holder)
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.binding.button.setOnClickListener(listener)
        holder.binding.button.text = label
    }

    override fun getDefaultLayout(): Int {
        return  R.layout.item_button
    }

    override fun createNewHolder(parent: ViewParent): Holder = Holder()
}