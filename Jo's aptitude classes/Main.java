a = int(input())
b = int(input())
c = int(input())
d = int(input())
x = []
x.append(a)
x.append(b)
x.append(c)
y = max(x)
for i in range(1,y+1):
  if(a%i==0 and b%i==0 and c%i==0):
    z = i
#print(z)  
if(z==d):
  print("Answer is correct.")
else:
  print("Answer is wrong.")