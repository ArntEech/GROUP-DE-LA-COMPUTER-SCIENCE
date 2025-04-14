## 🌍 Exercise 28 - Dictionary in a List 📜  
## 🏁 **Starting Code**

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

def add_new_country(country_name, visits_num, city_list):
    travel_log.append(
        {
            "country": country_name,
            "visits": visits_num,
            "cities": city_list,
        }
    )

# 🚨 Do not change the code below 👇
add_new_country("Russia", 2, ["Moscow", "Saint Petersburg"])
print(travel_log)

