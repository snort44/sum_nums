#Add numbers that are divisible by 3 or 5, under 1000 in R
sum_num <- 0
x <- 1

while(x < 1001)
{
   print(x)
   if( x%%3 == 0 | x%%5 == 0){
   	sum_num = sum_num + x
   }
   x = x+1
}
cat('This is the sum of all the values below 1000 that are divisible by 3 or 5: ', sum_num)
