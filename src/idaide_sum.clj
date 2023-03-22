(ns idaide-sum)
(defn soma-idade
  [idade]
  (reduce + idade)
  )
(soma-idade [5 10 5])