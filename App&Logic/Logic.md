{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Courier New;}{\f1\fnil Courier New;}}
{\*\generator Riched20 6.2.9200}\viewkind4\uc1 
\pard\ul\b\f0\fs22 Content-based filtering\ulnone\b0\par
\par
A common approach when designing recommender systems is content-based filtering. Content-based filtering methods are based on a description of the item and a profile of the user\rquote s preference. In a content-based recommender system, keywords are used to describe the items; beside, a user profile is built to indicate the type of item this user likes. In other words, these algorithms try to recommend items that are similar to those that a user liked in the past (or is examining in the present). In particular, various candidate items are compared with items previously rated by the user and the best-matching items are recommended. This approach has its roots in information retrieval and information filtering research.\par
\par
To abstract the features of the items in the system, an item presentation algorithm is applied. A widely used algorithm is the tf\f1\endash idf representation (also called vector space representation).\par
\par
\b\f0 <<Though our implementation will be focusing upon KL-Divergence and Topic Modelling and some concepts of LDA>>\b0\f1\par
\par
To create user profile, the system mostly focuses on two types of information: 1. A model of the user's preference. 2. A history of the user's interaction with the recommender system.\par
\par
Basically, these methods use an item profile (i.e. a set of discrete attributes and features) characterizing the item within the system. The system creates a content-based profile of users based on a weighted vector of item features. The weights denote the importance of each feature to the user and can be computed from individually rated content vectors using a variety of techniques. Simple approaches use the average values of the rated item vector while other sophisticated methods use machine learning techniques such as Bayesian Classifiers, cluster analysis, decision trees, and artificial neural networks in order to estimate the probability that the user is going to like the item.\par
\par
Direct feedback from a user, usually in the form of a like or dislike button, can be used to assign higher or lower weights on the importance of certain attributes (using Rocchio Classification or other similar techniques).\par
\par
\par
\ul\b\f0 Issue(Cons):\ulnone\b0\f1\par
A key issue with content-based filtering is whether the system is able to learn user preferences from user's actions regarding one content source and use them across other content types. When the system is limited to recommending content of the same type as the user is already using, the value from the recommendation system is significantly less than when other content types from other services can be recommended. For example, recommending news articles based on browsing of news is useful, but it's much more useful when music, videos, products, discussions etc. from different services can be recommended based on news browsing.\par
\par
As previously detailed, Pandora Radio is a popular example of a content-based recommender system that plays music with similar characteristics to that of a song provided by the user as an initial seed. There are also a large number of content-based recommender systems aimed at providing movie recommendations, a few such examples include Rotten Tomatoes, Internet Movie Database, Jinni, Rovi Corporation, Jaman and See This Next.\par
\par
\par
\par
\f0\par
}
