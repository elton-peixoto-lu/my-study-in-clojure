(ns json-babashka)
(require '[babashka.curl :as curl])
(require '[clojure.java.io :as io]) ;; optional
(require '[cheshire.core :as json]) ;; optional


(let [ result (curl/get "https://www.tesourodireto.com.br/json/br/com/b3/tesourodireto/service/api/treasurybondsimulator.json" {:query-params {}})]
  (filter  #( = % (Character/isLetter ":\\\"Tesouro Selic 2029\\\",")) result))
