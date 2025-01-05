/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 * @param {string} s
 * @return {number}
 */
 export function lengthOfLongestSubstring(s) {
  if (s.length == 0) {
    return 0;
  }
  const set = new Set();
  let length = 0;
  let head = 0;
  let tail = 0;
  let maximum = 0;
  while(head < s.length) {
    if (set.has(s[head]) === true) {
      if (length > maximum) {
        maximum = length;
      }
      while(s[tail] !== s[head]) {
        set.delete(s[tail]);
        length--;
        tail++;
      }
      tail++;
    } else {
      set.add(s[head])
      length++;
    }
    head++;
  }
  if (length > maximum) {
    maximum = length;
  }
  return maximum;
};