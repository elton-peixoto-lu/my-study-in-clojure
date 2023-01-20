(ns basic-one)
;; Compile error as `add` has not yet been defined
(def seven (add 3 4))

(defn add [x y]
  (+ x y))




