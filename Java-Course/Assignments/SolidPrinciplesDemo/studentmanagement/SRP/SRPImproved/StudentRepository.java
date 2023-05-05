package studentmanagement.SRP.SRPImproved;

public interface StudentRepository {
    void save(StudentSRPImproved student);

    void update(StudentSRPImproved student);

    void delete(int rollNo);
}
