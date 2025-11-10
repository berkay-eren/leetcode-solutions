# Last updated: 10/11/2025, 15:53:23
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # nums1 last index
        last = m + n - 1

        # merge in reverse
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[last] = nums1[m - 1]
                m -= 1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1

        # edge case 
        while n > 0:
            nums1[last] = nums2[n - 1]
            n -= 1
            last -= 1