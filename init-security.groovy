import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

println "--> Setting up admin user and disabling anonymous access"

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("rakib", "rakib")   
hudsonRealm.createAccount("ci", "rakib")        // pipeline user
instance.setSecurityRealm(hudsonRealm)

def strategy = new GlobalMatrixAuthorizationStrategy()
strategy.add(Jenkins.ADMINISTER, "rakib")
strategy.add(Jenkins.READ, "ci")
strategy.add(Item.READ, "ci")
strategy.add(Item.DISCOVER, "ci")
strategy.add(Item.BUILD, "ci")
strategy.add(Item.CANCEL, "ci")
instance.setAuthorizationStrategy(strategy)

instance.save()
println "--> Security configuration complete"
