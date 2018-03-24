(ns api-mock.handler.example
  (:require [compojure.core :refer :all]
            [integrant.core :as ig]))

(defmethod ig/init-key :api-mock.handler/example [_ options]
  (context "/example" []
    (GET "/a" request
        {
          :status 200
          :headers {
                     "Content-Type" "application/json;charset=UTF-8",
                     "Access-Control-Allow-Origin" "*"
                     }
          :body {:example "dataaaaa"}
          }
        )
    (GET "/b" []
      {:body {:example "data"}})))
