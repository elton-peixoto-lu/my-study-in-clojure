(:require [clojure.math.numeric-tower :as math] )
(defn multtab [n]
  (for [row (range n) col (range n)]
    (* (inc row) (inc col))))

;; reasonably nicely formatted
(defn main [n]
  (let [width (int (Math/ceil (/ (Math/log (* n n)) (Math/log 10))))
        digit-str (str "%" (inc width) "d")]
    (println width)
    (doseq [row (partition n (multtab n))]
      (let [formatted-row (map #(format digit-str %) row)]
        (println (apply str formatted-row))))))

;; if you don't care about formatting
(defn show-multtab [n]
  (doseq [r (partition n (multtab n))]
    (println (apply str (interpose " " r)))))