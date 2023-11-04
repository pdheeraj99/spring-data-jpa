# OneToOne(mappedBy)

Imagine Bob and Alice are dating, but Bob doesn't really care about Alice's house. He's just happy to have a girlfriend. So, Bob's car is the main thing here, and Alice's house is just a side note. If something happens to Bob's car, the relationship might still continue, but Alice's house won't be affected.

This is similar to how OneToOne(mappedBy) works. It specifies that the owning side of the relationship is the other entity. The foreign key is maintained by the other entity.

# OneToOne(cascade)

Imagine that Bob and Alice are not just dating, they are deeply connected. If something happens to Bob's car, Alice's house will also be affected. It's like they are a package deal. So if Bob's car gets stolen, Alice's house might get stolen too! This is a risky but adventurous relationship.

This is similar to how OneToOne(cascade) works. It specifies that operations performed on the owning side of the relationship should be cascaded to the other entity.
