package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemTextPasswordBinding

open class ItemPasswordModel :EpoxyModelWithHolder<ItemPasswordModel.Holder>(){
    class Holder :EpoxyHolder(){
        lateinit var binding:ItemTextPasswordBinding
        override fun bindView(itemView: View) {
            binding = ItemTextPasswordBinding.bind(itemView)
        }
    }

    @EpoxyAttribute
    var hint=""

    private lateinit var  binding:ItemTextPasswordBinding

    override fun getDefaultLayout(): Int {
        return R.layout.item_text_password
    }

    fun getText(): String {
        return  binding.txtTextField.text.toString()
    }

    override fun createNewHolder(parent: ViewParent): Holder {
       return Holder()
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder.binding){
            binding=this
            txtContainer.hint=hint

        }
    }
}