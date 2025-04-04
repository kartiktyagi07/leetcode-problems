class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        cnt=0
        for cost in costs:
            if coins>=cost:
                coins-=cost
                cnt+=1
            else:
                break
        return cnt    

        