(ns clojure-trainning.calendar


(:import [java.time LocalDate DayOfWeek]))
(defn create-calendar [year]
  (for [month (range 1 13)]
    (let [first-day (LocalDate/of year month 1)
          first-day-of-week (.getValue (.getDayOfWeek first-day))
          days-in-month (.lengthOfMonth first-day)]
      {:month month
       :first-day-of-week first-day-of-week
       :days-in-month days-in-month})))

(defn print-calendar [year]
  (doseq [month-calendar (create-calendar year)]
    (println (str "Month " (:month month-calendar)))
    (println "Sun Mon Tue Wed Thu Fri Sat")
    (let [day-of-week (:first-day-of-week month-calendar)
          padding (apply str (repeat (* day-of-week 5) " "))]
      (dotimes [i day-of-week]
        (print "    "))
      (loop [day 1
             day-of-week day-of-week]
        (when (<= day (:days-in-month month-calendar))
          (printf "%3d " day)
          (if (= day-of-week 6)
            (do (println)
                (recur (inc day) 0))
            (recur (inc day) (inc day-of-week)))))
      (println))))

  ; Chame a função para criar o calendário do ano desejado
  (print-calendar 2024)