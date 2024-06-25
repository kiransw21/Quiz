import numpy as np
import matplotlib.pyplot as mtp
import pandas as pd
data_set=pd.read_csv('data.csv')
data_set
x=data_set.iloc[:,:-1],values
y=data_set.iloc[:,1].values
from sklearn.model_selection import train_test_split
regressior=Linear Regression()
y-pred = regressor.predict(x_test)
x-pred=regressor.predict(x_train)
mtp.scatter(x_train,y_train,color="green")
mtp.plot(x_train,x_pred,color="red")
mtp.title("Salary vs Experience(Training Dataset)")
mtp.xlabel("years of Experience")
mtp.ylabel("salary(In Rupees)")
mtp.show()
mtp.scatter(x_test,y_test,color="blue")
mtp.plot(x_train,x_pred,color="red")
mtp.xlabel("years of Experience")
mtp.ylabel("salary(In Rupees)")
mtp.show()