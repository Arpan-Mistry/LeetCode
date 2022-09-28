class Solution:      
    def romanToInt(self, s: str) -> int:
        d={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        s_len=len(s)
        out=0
        for i in range(0,s_len):
            if(i!=s_len-1 and d[s[i]]<d[s[i+1]]):
                out+=((-1)*d[s[i]])
            else:
                out+=d[s[i]]
        return out
            
            