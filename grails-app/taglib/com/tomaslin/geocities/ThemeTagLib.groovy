package com.tomaslin.geocities

class ThemeTagLib {
	static namespace = "geocities"
	
	def img = {
		out << g.img(dir:'images', plugin:'geocities-theme', file:"${new Random().nextInt(46)}.gif")
	}
}
