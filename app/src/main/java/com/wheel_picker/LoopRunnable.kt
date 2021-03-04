package com.wheel_picker

internal class LoopRunnable(private val loopView: LoopView) : Runnable {

    override fun run() {
        val listener = loopView.loopListener
        val selectedItem = LoopView.getSelectedItem(loopView)
        loopView.arrayList[selectedItem]
        listener?.onItemSelect(loopView, selectedItem)
    }
}
