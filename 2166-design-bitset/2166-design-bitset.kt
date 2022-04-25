class Bitset(size: Int) {
    private var size = 0
    private val bitset = BooleanArray(size)

    fun fix(idx: Int) {
        if (!bitset[idx]) size++
        bitset[idx] = true
    }

    fun unfix(idx: Int) {
        if (bitset[idx]) size--
        bitset[idx] = false
    }

    fun flip() {
        for (i in bitset.indices) bitset[i] = !bitset[i]
        size = bitset.size - size
    }

    fun all(): Boolean = size == bitset.size

    fun one(): Boolean = size > 0

    fun count(): Int = size

    override fun toString(): String = bitset.joinToString("") { if (it) "1" else "0" }

}

/**
 * Your Bitset object will be instantiated and called as such:
 * var obj = Bitset(size)
 * obj.fix(idx)
 * obj.unfix(idx)
 * obj.flip()
 * var param_4 = obj.all()
 * var param_5 = obj.one()
 * var param_6 = obj.count()
 * var param_7 = obj.toString()
 */