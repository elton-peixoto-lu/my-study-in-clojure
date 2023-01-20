(ns hours)
(defn greetings
  "provides an hour-appropriate greeting string"
  [hour]
  (cond
    (< hour 12)  "Good Morning"
    (< hour 17)  "Good Afternoon"
    (< hour 20)  "Good Evening"
    (>= hour 21) "Good Night"))

(greetings 10)
(greetings 13)
(greetings 18)
(greetings 23)