package com.example.epoxyexampleapp.components

import android.text.InputType
import android.util.Log
import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxyexampleapp.R
import com.example.epoxyexampleapp.databinding.ItemTextFieldBinding

open class ItemTextField:EpoxyModelWithHolder<ItemTextField.Holder>() {
    @EpoxyAttribute
    var hint=""


  private lateinit var  binding:ItemTextFieldBinding

    class Holder :EpoxyHolder(){
        lateinit var binding: ItemTextFieldBinding
        override fun bindView(itemView: View) {
           binding = ItemTextFieldBinding.bind(itemView)
        }
    }

    fun getText(): String {
      return  binding.txtTextField.text.toString()
    }



    override fun getDefaultLayout(): Int = R.layout.item_text_field

    override fun createNewHolder(parent: ViewParent): Holder= Holder()

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(holder.binding){
            binding=this
            txtContainer.hint=hint
            //Log.d("Gondai","$password")
            //txtTextField.inputType=if (password) InputType.TYPE_TEXT_VARIATION_PASSWORD else InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        }
    }
}