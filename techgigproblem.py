def main():

 # Write code here
    n,m = (input().split(" "))
    #print(n)
    data=[] 
    for i in range(int(m)):
        weights = list(int(x) for x in input().split(" "))
        data.append(weights)
    #print(*data)
    begin=[]
    end=[]
    cost=[]
    for i in data:
        end.append(i[1])
        begin.append(i[0])
        cost.append(i[2])
    #mat=[[0]  * int(m)]*int(m)
    #print(*end)
    if int(n) in end:
        #print("NOT POSSIBLE")
        sum=0
        x= int(m)-1
        while(x!=1):
            if(x in begin):
                idx= begin.index(x)
                sum+=cost[idx]
                break
            else:
                x-=1
        print(sum)
    else:
        print("NOT POSSIBLE")


main()

