class Solution:
    def isPalindrome(self, s: str) -> bool:
        str_cln=re.sub(r'[^a-zA-Z0-9]','',s).lower()
        i,j=0,len(str_cln)-1
        while i<=j:
            if str_cln[i]!=str_cln[j]:
                return False
            i+=1
            j-=1 
        return True       

        