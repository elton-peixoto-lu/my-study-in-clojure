(ns deleting-aws)


;;(def part-nucket {:name "s3://nu-keysets-br-staging"})


(def user-map {:fname "s3://"})

(def map-map {:part-nucket ".json"
              })
(def name
  (str (:fname user-map) (:part-nucket map-map)))


(println name)

