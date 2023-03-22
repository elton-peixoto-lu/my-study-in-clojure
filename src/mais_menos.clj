(ns mais-menos)


(def menos
  (->> [0]
       (map + [1])))

(def mais
  (->> [3]
       (map - [4])))


(println mais)

(println menos)

