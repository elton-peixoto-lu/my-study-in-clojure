(ns media-soma-nomes)


(defn somanome
  [nomes]
  (/
     (reduce +
             (->> nomes (map count)))
             (count nomes)))

(somanome ["Mari" "Joao"])