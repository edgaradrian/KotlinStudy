package extensions

private fun <T> Iterable<T>.random(): T = this.shuffled().first()