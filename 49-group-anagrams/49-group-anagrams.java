class Solution {

  private static String sort(String s) {
    var sorted = s.toCharArray();
    Arrays.sort(sorted);
    return String.valueOf(sorted);
  }

  public List<List<String>> groupAnagrams(String[] strs) {
    return new ArrayList<>(
        Arrays
            .stream(strs)
            .collect(Collectors.groupingBy(Solution::sort))
            .values()
    );
  }
}