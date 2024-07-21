class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        b: bool = True
        while b:
            if val in nums:
                nums.remove(val)
            else:
                b = False
        return len(nums)