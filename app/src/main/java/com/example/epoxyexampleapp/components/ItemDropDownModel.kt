package com.example.epoxyexampleapp.components

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemDropDownBinding

open class ItemDropDownModel :EpoxyModelWithHolder<ItemDropDownModel.Holder>(){
    class Holder :EpoxyHolder(){
        lateinit var binding:ItemDropDownBinding
        override fun bindView(itemView: View) {
            binding = ItemDropDownBinding.bind(itemView)
        }
    }

    @EpoxyAttribute
    var hint=""

    private lateinit var  binding:ItemDropDownBinding

    override fun getDefaultLayout(): Int {
        return R.layout.item_drop_down
    }

    fun getText(): String {
        return  "Hello"
    }

    override fun createNewHolder(parent: ViewParent): Holder {
       return Holder()
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder.binding){
            binding=this
            //txtContainer.hint=hint

        }
    }
}