# 🎯 DAY EIGHT - Mastering Key-Value Data Structures 🔑  

## 🏆 Exercise 27 - Grading Program 📊  

## 📜 **Instructions:**  

1️⃣ You have access to a dataset that contains **names** and their corresponding **scores**.  

2️⃣ The data is stored in a structured format where:  

   - 🏷️ The **keys** represent names.  
   - 🔢 The **values** represent numerical scores.  

3️⃣ Your task is to **convert the numerical scores into performance ratings** based on the given criteria.  

4️⃣ By the end of your program, you should have a **new structured dataset** where:  

   - 🏷️ The **keys** remain the names.  
   - 🌟 The **values** are the assigned **performance ratings**.  

5️⃣ **⚠️ DO NOT** modify the original dataset.  

6️⃣ **🚫 DO NOT** include print statements in your code.  

---

## 🎯 **Performance Rating Criteria:**  

✅ Scores **91 - 100** → 🏅 **"Outstanding"**  

✅ Scores **81 - 90** → 🌟 **"Exceeds Expectations"**  

✅ Scores **71 - 80** → 📘 **"Acceptable"**  

✅ Scores **70 or lower** → ❌ **"Fail"**  

---

## 💡 **Hints:**  

💭 When looping through the dataset, remember that iterating directly over it gives access to the **keys**, not the values.  

🧐 If your code is not behaving as expected, try debugging by checking intermediate values.  

🛑 At the end of your program, the **original dataset must remain unchanged**, while your new dataset should contain the updated ratings.  

---

## 🏁 **Starting Code**  

```python
# Sample dataset (🚨 DO NOT modify)
scores_data = {
    "Harry": 81,
    "Ron": 78,
    "Hermione": 99,
    "Draco": 74,
    "Neville": 62,
}
# 🚨 Do not change the code above 👆

# 📝 TODO-1: Create an empty dataset to store the converted ratings.


# 🚀 TODO-2: Write your logic below to populate the new dataset. 👇


'''

Modify the above code to your programming language equivalent of dictionaries(e.g Hashmaps<K, V> - java, Object or map - javascript e.t.c)

'''
```

 

## 🌍 Exercise 28 - Dictionary in a List 📜  

## 📝 **Instructions:**  

1️⃣ You are given a **structured dataset** that contains a **list of travel records**.  

2️⃣ Each record is a **dictionary** with the following keys:  

   - 🏷️ **"country"** → The name of the country visited.  
   - 🔢 **"visits"** → The number of times the country has been visited.  
   - 🏙️ **"cities"** → A list of cities visited in that country.  

3️⃣ Your task is to **write a function** that will update this dataset by adding a **new travel record**.  

4️⃣ Your function should work with the following command:  

   ```python
# Call the below function/method in your programing language equivalent
add_new_country("Russia", 2, ["Moscow", "Saint Petersburg"])
```
+ Output:

You've visited Russia 2 times.

You've been to Moscow and Saint Petersburg.

5️⃣ ⚠️ DO NOT modify the original dataset directly. The function must handle the update dynamically.

## 💡 **Hints:**  

💭 Observe the function call format to determine the required parameters.

🛠️ The function should accept three positional arguments: country name, number of visits, and the list of cities.

📌 Ensure that the new entry follows the same structure as the existing records. The order is very important.

💭 Feel free to choose your own parameter names. 

## 🏁 **Starting Code**  

```python
# Sample dataset (🚨 DO NOT modify)
travel_log = [
    {
        "country": "France",
        "visits": 12,
        "cities": ["Paris", "Lille", "Dijon"]
    },
    {
        "country": "Germany",
        "visits": 5,
        "cities": ["Berlin", "Hamburg", "Stuttgart"]
    },
]
# 🚨 Do NOT change the code above 👆

# 📝 TODO-1: Write a function that allows new countries
# to be added to the travel_log. 👇



# 🚨 Do not change the code below 👇
add_new_country("Russia", 2, ["Moscow", "Saint Petersburg"])
print(travel_log)
```
🔄 Language Adaptation Challenge

🛠 Modify the above code to your programming language equivalent of dictionaries.

  - Java: Use HashMaps<K, V> inside a List.
  - JavaScript: Use Objects or Maps inside an Array.
  - C++: Use unordered_map<K, V> inside a vector.




