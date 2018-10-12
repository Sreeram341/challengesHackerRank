class Solution:
    def solveEquation(self, equation):
        symb = ['+', '-', '*', '/']
        spliElem = equation.split('=')
        inSplitLis = []
        outerCntr = 0
        for i in spliElem:
            currStrLis = list(i)
            currStr=i
            cntr=0
            newCntr=0
            innerSplitLis = []
            newLis = []
            for j in currStrLis:
                newCntr += 1
                if j in symb:
                    innerSplitLis.append(currStr[cntr:newCntr-1])
                    cntr = newCntr
                    innerSplitLis.append(currStr[cntr-1])
            innerSplitLis.append(currStr[cntr:newCntr])
            strtCntr, endCntr = 0, 0
            strgDict = {"x":0,"Num":0}
            for k in range(len(innerSplitLis)):
                if innerSplitLis[k] in symb:
                    if strtCntr == 0 and endCntr == 0:
                        strtCntr = k
                        endCntr = k
                    elif strtCntr > 0:
                        endCntr = k
                        s = "".join(innerSplitLis[strtCntr:endCntr])

                        newLis.append(s)
                        strtCntr = k
                elif strtCntr < 1:
                    s = "".join(innerSplitLis[:k+1])
                    if "x" in list(s):
                        print(s)
            else:
                if strtCntr>0:
                    s = "".join(innerSplitLis[endCntr:len(innerSplitLis)])
                    newLis.append(s)

            inSplitLis.insert(outerCntr, newLis)
            outerCntr += 1

        print(inSplitLis)


sol = Solution()
sol.solveEquation("2x+5-3+2x=6+x-2")

sol.solveEquation("2x+3x-6x+1=x")
