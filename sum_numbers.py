#Add numbers that are divisible by 3 or 5, under 1000
sum_num = 0

for x in range(1,1001):
    if(x%3 == 0 or x%5 == 0):
        sum_num += x
    
print("Thi≈s is the sum of all the values below 1000 that are divisible by 3 or 5: " ,sum_num)
