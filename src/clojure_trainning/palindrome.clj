(ns clojure-trainning.palindrome)

(defn palindrome? [s]
  (= (seq s) (reverse (seq s))))



  (seq "abc")

(every? seq ["1" [1] '(1) {:1 1} #{1}])

(filter even? (range 10))