package com.cymose.stix.sdk.patterens;

/**
 * class Pattern:
 * # master pattern object.  keeps track of global attributes
 * def __init__(self):
 * self.flags = 0
 * self.open = []
 * self.groups = 1
 * self.groupdict = {}
 * self.lookbehind = 0
 * <p>
 * def opengroup(self, name=None):
 * gid = self.groups
 * self.groups = gid + 1
 * if name is not None:
 * ogid = self.groupdict.get(name, None)
 * if ogid is not None:
 * raise error, ("redefinition of group name %s as group %d; "
 * "was group %d" % (repr(name), gid,  ogid))
 * self.groupdict[name] = gid
 * self.open.append(gid)
 * return gid
 * def closegroup(self, gid):
 * self.open.remove(gid)
 * def checkgroup(self, gid):
 * return gid < self.groups and gid not in self.open
 */
public class Patterns {

}
