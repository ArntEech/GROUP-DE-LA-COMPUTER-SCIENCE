# 🎨 Day 12 - Programming with Graphics

Welcome to **Day 12** of our Intermediate Programming Journey! 🚀  
Today, we move from console-based programs to **programming with graphics**.  
You will begin creating drawings and visual outputs using **graphical modules or libraries** available in your programming language.

---

# ✏️ Exercise 32 - Draw a Square

## 📝 Instructions:

- Your task is to **draw a perfect square** using the **graphics module** or **drawing library** available in your programming language.  
- The square should have **four equal sides** and **right angles** (90 degrees at each corner).

## 🌐 Guidance:

- 📚 **Research and read the official documentation** of your chosen language’s graphics or drawing library.
- 🛠️ Find how to:
  - Move your graphic object **forward** a certain distance.
  - **Rotate/turn** your graphic object by a specific angle.
- 🖍️ You can choose any color or drawing speed.

---


## 💡 Notes:

- You **should not** print to the console — this challenge is about **visual drawing**.
- The focus is on using **commands to move** and **rotate** your drawing object.
- **Examples of graphics libraries you can use:**
  - Python: `turtle`
  - JavaScript: `p5.js`, `Canvas API`
  - Java: `Graphics2D`
  - C++: `SFML`, `SDL`
  - C#: `System.Drawing`
  - Swift: `UIKit`, `CoreGraphics`

✅ Draw the square using the proper graphical commands for your language.  
✅ The square must appear visually on the screen or drawing canvas.

---

🚀 **Stay tuned: More exercises for today will be added soon!**


# ✏️ Exercise 33 - Draw a Dashed Line

## 📝 Instructions:

- Your task is to **draw a dashed (broken) horizontal line** using the **graphics module** or **drawing library** available in your programming language.
- The dashed line should consist of **multiple short visible segments** separated by **invisible gaps**.

## 🌐 Guidance:

- 📚 **Research how to:**
  - Move the drawing object forward while **drawing a visible line**.
  - Temporarily **stop drawing** (i.e., lift the pen/disable drawing).
  - Move forward again **without drawing** (create a gap).
  - Resume **drawing again** after the gap.
- 🔁 Repeat this pattern multiple times (about 15 dashes recommended).

✅ Your dashed line must appear visually on the screen or drawing canvas.  
✅ Dashes and gaps should look balanced and uniform.

---


# ✏️ Exercise 34 - Draw Overlaid Shapes

## 📝 Instructions:

- Your task is to **draw multiple different regular polygons** (shapes) overlaid on each other using your **graphics module** or **drawing library**.
- The shapes you need to draw:
  - Triangle (3 sides)
  - Square (4 sides)
  - Pentagon (5 sides)
  - Hexagon (6 sides)
  - Heptagon (7 sides)
  - Octagon (8 sides)
  - Nonagon (9 sides)
  - Decagon (10 sides)

- **Requirements:**
  - Each shape must have a **different pen color**.
  - All shapes should be **overlaid (drawn on the same center or origin)** without moving the base position.

## 🌐 Guidance:

- 📚 **Research:**
  - How to change **pen or stroke color**.
  - How to draw polygons by moving forward and turning by a certain angle.
  - **Hint:**  
    The angle to turn for each shape = `360 ÷ number of sides`.
    - Example: A square has 4 sides → `360 ÷ 4 = 90 degrees` turn at each corner.
- 🔄 For each shape:
  - Change the color.
  - Loop through the correct number of sides.
  - Move forward and turn accordingly.

---

## 🎯 Reference Output:

Your final drawing should look similar to this:

![outcome](https://github.com/user-attachments/assets/f9062b9d-b34b-4fb4-94b0-a56936b28a31)


---

✅ Focus on **movement, rotation, color changing, and shape logic**.

✅ Make sure your graphics canvas or screen stays open after drawing so you can view your work.

---

# ✏️ Exercise 35 - Random Walk (Fixed Distance)

## 📝 Instructions:

- Your task is to create a **random walk simulation** where a drawing object moves **forward by a fixed distance** every time, but **randomizes its direction** at each turn.
- Each movement should also use a **random color**.

---

## 🌐 Objectives:

- 📏 Learn how to **set a fixed movement distance** for each step.
- 🎨 Learn how to **change the color randomly** after every move.
- 🧭 Move in **cardinal directions only**: North (0°), East (90°), South (180°), or West (270°).
- 🎲 Randomize the **direction** and the **color** after each move.
- 📈 Increase the **pen thickness** for better visibility.
- ⚡ Speed up your drawing object's movement for faster completion.

---

## 🌐 Guidance:

- 📚 Research how to:
  - Set a **fixed pen width** or thickness.
  - Change **pen colors randomly** from a list of color names.
  - Move **forward a constant distance** every time (e.g., 20 units).
  - Turn randomly among **0°, 90°, 180°, or 270°** after each move.
  - Increase the **drawing speed**.

- 🔁 Repeat the process for about **100 steps** (or more for a longer walk).
- 🖍️ Use **bright and varied colors** to make the walk colorful and lively.

---

## 💡 Important:
- ✅ **Distance moved must stay the same** every time (e.g., always 20 units).
- ✅ Only the **direction and color must change randomly** at each step.
- ✅ Make sure your graphics screen stays open after the drawing finishes so you can admire your work.

---


---

# ✏️ Exercise 36 - Draw a Spirograph

## 📝 Instructions:

- Your task is to **draw a spirograph** — a beautiful circular pattern made up of **many overlapping circles**.
- Each circle should have a **slightly different rotation angle** from the previous one.
- Each circle should also be drawn in a **random color** to create a colorful spiral effect.

---

## 🌐 Objectives:

- 🎯 Learn how to **draw a full circle**.
- 🎯 Learn how to **rotate** the drawing object a little after each circle is drawn.
- 🎯 Learn how to **generate random RGB colors** (or use a random color palette if your language does not support RGB directly).
- 🎯 Adjust the **speed** for smooth fast drawing.

---

## 🌐 Guidance:

- 📚 Research how to:
  - Draw a **full circle** using your graphics/drawing library.
  - **Rotate** your drawing tool or object by a small degree (e.g., 5 degrees) after each circle.
  - Generate **random colors** for variety.
  - Increase **drawing speed** to complete the pattern faster.

- 🔄 Repeat the process:
  - Draw a circle.
  - Rotate slightly.
  - Draw the next circle.
  - Keep repeating for **about 200 rotations** to create the full spirograph.

- 🎨 If your language allows (e.g., Python turtle), you can set color using RGB values. Otherwise, use a random color from a predefined list.

---
## 💡 Important:

- ✅ Draw **one full circle** each time.
- ✅ Rotate your object by a **small fixed angle** (e.g., 5 degrees) before drawing the next circle.
- ✅ Use **different random colors** for each circle.
- ✅ Keep your pen down throughout the drawing.
- ✅ At the end of your program, it should look similar to the pic below:
![image](https://github.com/user-attachments/assets/369f01b2-d6c4-40fa-abbd-e1aaa60ae85d)

---







