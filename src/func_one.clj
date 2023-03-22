(ns func-one)

(fn [name]
  (str "Hello " name))
(map (fn [name] (str "Hello " name)) ["Inez" "Maria" "Fred" "Joao"])
