# 🎯 DAY NINE - Functions with Outputs 🔄  

## 📅 Exercise 29 - Days in Month  

## 📝 **Instructions:**  

1️⃣ In the **starting code**, you will find the **solution from the Leap Year challenge** (use your programming language equivalent).  

2️⃣ First, **modify the `is_leap()` function** so that:  
   - ✅ It **returns** `True` if the given year is a **leap year**.  
   - ❌ It **returns** `False` if the year is **not a leap year**.  

3️⃣ Next, **create a function** called `days_in_month()` that:  
   - 📆 Accepts **two parameters**: `year` and `month`.  
   - 🔍 Uses this data to determine the **number of days in the given month**.  
   - 📤 **Returns** the correct number of days.  

4️⃣ **Example Function Call:**  

```python
#Call the function/method below in your programming language equivalent
days_in_month(year=2022, month=2)
```
✅ Expected Output:
```py
28
```
5️⃣ The list month_days contains the number of days per month (January to December) for a non-leap year.

In a leap year, February has 29 days instead of 28.

### **💡 Hints:**

💭 Look at the function call at the bottom of the code to understand the positional arguments. The order is very important.

📌 Ensure your function correctly handles leap years when calculating days for February.

🔄 Your function must return the value instead of printing it.

💭 Feel free to choose your own parameter names.

## 🏁 **Starting Code** 
```python
def is_leap(year):
  if year % 4 == 0:
    if year % 100 == 0:
      if year % 400 == 0:
        print("Leap year.")
      else:
        print("Not leap year.")
    else:
      print("Leap year.")
  else:
    print("Not leap year.")

def days_in_month():
  month_days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]  
  
  
#🚨 Do NOT change any of the code below 
year = int(input("Enter a year: "))
month = int(input("Enter a month: "))
days = days_in_month(year, month)
print(days)

#Modify the above code to your programming language equivalent but do not change how it works
```
🔄 Language Adaptation Challenge

🛠 Modify the above code to your programming language equivalent:
  - Java: Use ArrayLists or HashMaps.
  - JavaScript: Use Arrays and Objects.
  - C++: Use vectors and unordered_map<K, V>.

