package com.zhf.auxiliary.suctiontop.indicator

import android.content.Context

import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView

/**
 * 带颜色渐变和缩放的指示器标题
 * 博客: http://hackware.lucode.net
 */
class ScaleTransitionPagerTitleView(context: Context) : ColorTransitionPagerTitleView(context) {
	var minScale = 0.9f
	
	override fun onEnter(index: Int, totalCount: Int, enterPercent: Float, leftToRight: Boolean) {
		super.onEnter(index, totalCount, enterPercent, leftToRight)    // 实现颜色渐变
		scaleX = minScale + (1.0f - minScale) * enterPercent
		scaleY = minScale + (1.0f - minScale) * enterPercent
	}
	
	override fun onLeave(index: Int, totalCount: Int, leavePercent: Float, leftToRight: Boolean) {
		super.onLeave(index, totalCount, leavePercent, leftToRight)    // 实现颜色渐变
		scaleX = 1.0f + (minScale - 1.0f) * leavePercent
		scaleY = 1.0f + (minScale - 1.0f) * leavePercent
	}
}
