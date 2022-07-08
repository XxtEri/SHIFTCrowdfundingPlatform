package com.example.shift.mvp.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.shift.databinding.ItemCardProjectBinding

/**
 * Вьюшка для отображения блока на поле
 */
class CardProjectView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defstyleAttr: Int = 0,
    defstyleRes: Int = 0
) : LinearLayout(context, attrs, defstyleAttr, defstyleRes){

    private val cardProjectBinding = ItemCardProjectBinding.inflate(LayoutInflater.from(context), this)

    private var needMoney = 0.0

    /**
     * Задаем название проекта
     */
    fun setNameProject(nameProject: String) {
        if (cardProjectBinding.texNameProject.text == "") {
            cardProjectBinding.texNameProject.text = nameProject
        }
    }

    /**
     * Задаем описание проекта
     */
    fun setDescriptionProject(descriptionProject: String) {
        if (cardProjectBinding.textDescriptionProject.text == "") {
            cardProjectBinding.textDescriptionProject.text = descriptionProject
        }
    }

    /**
     * Задаем собранную сумму
     */
    @SuppressLint("SetTextI18n")
    fun setNewCollectedMoneyProject(newCollectedMoney: Double) {
        cardProjectBinding.collectedMoney.text = newCollectedMoney.toString() + "руб."
    }

    /**
     * Задаем необходимую сумму
     */
    fun setNeedMoneyProject(newNeedMoney: Double) {
        needMoney = newNeedMoney
    }

}