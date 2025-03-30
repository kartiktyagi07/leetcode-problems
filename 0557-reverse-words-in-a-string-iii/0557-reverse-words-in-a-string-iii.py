class Solution:
    def reverseWords(self, s: str) -> str:
        # Split the string on the basis of spaces
        words=s.split(" ")
        # then using list comprehension built a new list ::-1 is used to
        # reverse list,string or numbers
        rever_words=[word[::-1] for word in words]
        # at lst jon the list with spaces to produce expected output
        return " ".join(rever_words)
        