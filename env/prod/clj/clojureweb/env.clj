(ns clojureweb.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojureweb started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojureweb has shut down successfully]=-"))
   :middleware identity})
