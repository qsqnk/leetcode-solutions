class Solution {
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val wordCount = hashMapOf<String, Int>()
        for ((sender, message) in senders.zip(messages)) {
            wordCount.merge(sender, message.split(" ").size, Int::plus)
        }
        return senders.maxWith(compareBy(wordCount::get, { it })) ?: ""
    }
}