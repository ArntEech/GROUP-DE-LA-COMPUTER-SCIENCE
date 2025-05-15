def is_leap(year):
  if year % 4 == 0:
    if year % 100 == 0:
      if year % 400 == 0:
        print("True")
      else:
        print("False")
    else:
      print("True")
  else:
    print("False")

def days_in_month(year, month):
  month_days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31] 
  a = month_days[1] + 1
  if (year % 4 == 0 or year % 100 == 0 or year % 400 == 0) and (month == 2):
    print(a)
  else:
    print(month_days[month - 1])

  
#🚨 Do NOT change any of the code below 
year = int(input("Enter a year: "))
month = int(input("Enter a month: "))
days = days_in_month(year, month)
print(days)
#Modify the above code to your programming language equivalent but do not change how it works