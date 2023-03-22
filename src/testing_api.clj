(ns testing-api
(:require '[clj-http.client :as client]))

(defn make-api-request [url]
  (let [response (client/get url)]
    (:body response)))

(def data (make-api-request "https://api.example.com/data"))