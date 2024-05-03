package com.rahul.counter

import android.content.Context
import android.support.v7.widget.AppCompatEditText
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.rahul.counter.`interface`.ValueChangeListener


public class Counter : LinearLayout {

    constructor(context: Context) : super(context) {
        init(context,null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context,attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context,attrs)
    }


    lateinit var btnDecrement: AppCompatTextView
    lateinit var btnIncrement: AppCompatTextView
    lateinit var editValue: AppCompatEditText
    lateinit var view: View

    var listener: ValueChangeListener? = null


    public fun init(localContext: Context, attrs: AttributeSet?) {
        view = inflate(localContext, R.layout.counter, this);
        btnDecrement = view.findViewById(R.id.btnDecrement)
        btnIncrement = view.findViewById(R.id.btnIncrement)
        editValue = view.findViewById(R.id.editValue)

        btnIncrement.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                setValue(editValue.text.toString().toInt().inc().toString())
                listener?.let {
                    listener?.onValueIncremented(editValue.text.toString().trim())
                }
            }
        })

        btnDecrement.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                setValue(editValue.text.toString().toInt().dec().toString())
                listener?.let {
                    listener?.onValueDecremented(editValue.text.toString().trim())
                }
            }
        })
    }

    public fun setValue(value: String) {
        editValue.setText(value)

        listener?.let {
            listener?.onValueChanged(value)
        }
    }

    public fun setValueChangeListener(listener: ValueChangeListener) {
        this.listener = listener
    }
}