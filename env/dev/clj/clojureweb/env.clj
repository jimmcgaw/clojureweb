(ns clojureweb.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [clojureweb.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojureweb started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojureweb has shut down successfully]=-"))
   :middleware wrap-dev})
